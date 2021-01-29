import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

row_STG = CustomKeywords.'lm_dev_h.test.stg_ClmnSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME, DISPLAY_NAME)

if (LOOKUP_SYSTEM.equals('') && (LOOKUP_SYSTEM != null)) {
    LOOKUP_SYSTEM = null
}

if (LOOKUP_TABLE.equals('') && (LOOKUP_TABLE != null)) {
    LOOKUP_TABLE = null
}

if (LOOKUP_COLUMN.equals('') && (LOOKUP_COLUMN != null)) {
    LOOKUP_COLUMN = null
}

// Check for correct result
println('DISPLAY_NAME')

WS.verifyEqual(row_STG.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('LOOKUP_SYSTEM')

WS.verifyEqual(row_STG.LOOKUP_SYSTEM, LOOKUP_SYSTEM, FailureHandling.CONTINUE_ON_FAILURE)

println('LOOKUP_TABLE')

WS.verifyEqual(row_STG.LOOKUP_TABLE, LOOKUP_TABLE, FailureHandling.CONTINUE_ON_FAILURE)

println('LOOKUP_COLUMN')

WS.verifyEqual(row_STG.LOOKUP_COLUMN, LOOKUP_COLUMN, FailureHandling.CONTINUE_ON_FAILURE)

println('UPDATE_NULL_ALLOW_IND')

WS.verifyEqual(row_STG.UPDATE_NULL_ALLOW_IND, UPDATE_NULL_ALLOW_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('LU_ALLOW_NULL_FK_IND')

WS.verifyEqual(row_STG.LU_ALLOW_NULL_FK_IND, LU_ALLOW_NULL_FK_IND, FailureHandling.CONTINUE_ON_FAILURE)

