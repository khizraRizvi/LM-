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

row_BO = CustomKeywords.'lm_dev_h.test.bo_ClmnSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME, COLUMN_NAME)

if (DATA_DEFAULT.equals('') && (DATA_DEFAULT != null)) {
    DATA_DEFAULT = null
}

// Check for correct result
println('SYS_IND')

WS.verifyEqual(row_BO.SYS_IND, SYS_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('DISPLAY_NAME')

WS.verifyEqual(row_BO.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('COLUMN_NAME')

WS.verifyEqual(row_BO.COLUMN_NAME, COLUMN_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('NULLABLE')

WS.verifyEqual(row_BO.NULLABLE, NULLABLE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_TYPE')

WS.verifyEqual(row_BO.DATA_TYPE, DATA_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_LENGTH')

WS.verifyEqual(row_BO.DATA_LENGTH, DATA_LENGTH, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_PRECISION')

WS.verifyEqual(row_BO.DATA_PRECISION, DATA_PRECISION, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_SCALE')

WS.verifyEqual(row_BO.DATA_SCALE, DATA_SCALE, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_DEFAULT')

WS.verifyEqual(row_BO.DATA_DEFAULT, DATA_DEFAULT, FailureHandling.CONTINUE_ON_FAILURE)

println('TRUST_IND')

WS.verifyEqual(row_BO.TRUST_IND, TRUST_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MULTI_VALUES_IND')

WS.verifyEqual(row_BO.MULTI_VALUES_IND, MULTI_VALUES_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('VALIDATION_IND')

WS.verifyEqual(row_BO.VALIDATION_IND, VALIDATION_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MERGE_UPDATE_NULL_ALLOW_IND')

WS.verifyEqual(row_BO.MERGE_UPDATE_NULL_ALLOW_IND, MERGE_UPDATE_NULL_ALLOW_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('EXTERNAL_UID_IND')

WS.verifyEqual(row_BO.EXTERNAL_UID_IND, EXTERNAL_UID_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('PUTABLE_SYS_COL_IND')


WS.verifyEqual(row_BO.PUTABLE_SYS_COL_IND, PUTABLE_SYS_COL_IND, FailureHandling.CONTINUE_ON_FAILURE)

