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

row_LDG = CustomKeywords.'lm_dev_h.test.ldg_Sttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME)

if (DESCRIPTION.equals('') && (DESCRIPTION != null)) {
    DESCRIPTION = null
}

// Check for correct result
println('DISPLAY_NAME')

WS.verifyEqual(row_LDG.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_SPACE_NAME')

WS.verifyEqual(row_LDG.DATA_SPACE_NAME, DATA_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('INDEX_SPACE_NAME')

WS.verifyEqual(row_LDG.INDEX_SPACE_NAME, INDEX_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DESCRIPTION')

WS.verifyEqual(row_LDG.DESCRIPTION, DESCRIPTION, FailureHandling.CONTINUE_ON_FAILURE)

println('TABLE_TYPE')

WS.verifyEqual(row_LDG.TABLE_TYPE, TABLE_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('FULL_SET_LANDING_IND')

WS.verifyEqual(row_LDG.FULL_SET_LANDING_IND, FULL_SET_LANDING_IND, FailureHandling.CONTINUE_ON_FAILURE)

