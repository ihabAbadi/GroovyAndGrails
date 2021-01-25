import grails.test.AbstractCliTestCase

class FirstScriptTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testFirstScript() {

        execute(["first-script"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
