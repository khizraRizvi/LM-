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

row_LDG = CustomKeywords.'lm_dev_h.test.ldg_ClmnSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME, COLUMN_NAME)

if (DATA_DEFAULT.equals('') && (DATA_DEFAULT != null)) {
    DATA_DEFAULT = null
}

// Check for correct result
println('SYS_IND')

WS.verifyEqual(row_LDG.SYS_IND, SYS_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('DISPLAY_NAME')

WS.verifyEqual(row_LDG.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('NULLABLE')

WS.verifyEqual(row_LDG.NULLABLE, NULLABLE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_TYPE')

WS.verifyEqual(row_LDG.DATA_TYPE, DATA_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_LENGTH')

WS.verifyEqual(row_LDG.DATA_LENGTH, DATA_LENGTH, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_PRECISION')

WS.verifyEqual(row_LDG.DATA_PRECISION, DATA_PRECISION, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_SCALE')

WS.verifyEqual(row_LDG.DATA_SCALE, DATA_SCALE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_DEFAULT')

WS.verifyEqual(row_LDG.DATA_DEFAULT, DATA_DEFAULT, FailureHandling.CONTINUE_ON_FAILURE)

println('MULTI_VALUES_IND')

WS.verifyEqual(row_LDG.MULTI_VALUES_IND, MULTI_VALUES_IND, FailureHandling.CONTINUE_ON_FAILURE)
