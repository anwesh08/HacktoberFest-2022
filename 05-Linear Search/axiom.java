@Test(groups = { "wso2.esb" }, description = "Creating SOAP1.1 fault details as Element")
public void testSOAP11FaultDetailAsElement() {

    try {
        axis2Client.sendSimpleStockQuoteRequest(getProxyServiceURLHttp("Soap11FaultDetailAsElementProxy"), null,
                "WSO2");
        fail("This query must throw an exception.");
    } catch (AxisFault expected) {
        log.info("Fault Message : " + expected.getMessage());
        assertEquals(expected.getReason(), "Soap11FaultDetailAsElementTestCase", "Fault Reason Mismatched");
        assertEquals(expected.getFaultCode().getPrefix(), "soap11Env", "Fault code prefix mismatched");
        SOAPFaultDetail detailElm = expected.getFaultDetailElement();
        OMElement statusOME = detailElm
                .getFirstChildWithName(new QName("http://ws.apache.org/ns/synapse", "StatusCode", "axis2ns1"));
        assertNotNull(statusOME, "Fault detail element StatusCode null");
        assertEquals(statusOME.getText(), "1000", "Fault detail StatusCode mismatched");

        OMElement messageOME = detailElm
                .getFirstChildWithName(new QName("http://ws.apache.org/ns/synapse", "message", "axis2ns1"));
        assertNotNull(messageOME, "Fault detail element message null");
        assertEquals(messageOME.getText(), "fault details by automation", "Fault detail message mismatched");
    }
}
 
