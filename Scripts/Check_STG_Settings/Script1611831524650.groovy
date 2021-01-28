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

row_STG = CustomKeywords.'lm_dev_h.test.stg_Sttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME)

if (DESCRIPTION.equals('') && (DESCRIPTION != null)) {
    DESCRIPTION = null
}

if (RAW_RETENTION_UNITS_CD.equals('') && (RAW_RETENTION_UNITS_CD != null)) {
    RAW_RETENTION_UNITS_CD = null
}

// Check for correct result
println('DISPLAY_NAME')

WS.verifyEqual(row_STG.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_SPACE_NAME')

WS.verifyEqual(row_STG.DATA_SPACE_NAME, DATA_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('INDEX_SPACE_NAME')

WS.verifyEqual(row_STG.INDEX_SPACE_NAME, INDEX_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DESCRIPTION')

WS.verifyEqual(row_STG.DESCRIPTION, DESCRIPTION, FailureHandling.CONTINUE_ON_FAILURE)

println('TABLE_TYPE')

WS.verifyEqual(row_STG.TABLE_TYPE, TABLE_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('SYSTEM')

WS.verifyEqual(row_STG.SYSTEM, SYSTEM, FailureHandling.CONTINUE_ON_FAILURE)

println('PRESERVE_SRC_SYS_KEYS')

WS.verifyEqual(row_STG.PRESERVE_SRC_SYS_KEYS, PRESERVE_SRC_SYS_KEYS, FailureHandling.CONTINUE_ON_FAILURE)

println('HIGHEST_RESERVE_KEY')

WS.verifyEqual(row_STG.HIGHEST_RESERVE_KEY, HIGHEST_RESERVE_KEY, FailureHandling.CONTINUE_ON_FAILURE)

println('TIMELINE_FILL_ON_GAP')

WS.verifyEqual(row_STG.TIMELINE_FILL_ON_GAP, TIMELINE_FILL_ON_GAP, FailureHandling.CONTINUE_ON_FAILURE)

println('INFORMATICA_PLATFORM_STAGING')

WS.verifyEqual(row_STG.INFORMATICA_PLATFORM_STAGING, INFORMATICA_PLATFORM_STAGING, FailureHandling.CONTINUE_ON_FAILURE)

println('SYNC_WITH_MODEL_REPOS_SRV')

WS.verifyEqual(row_STG.SYNC_WITH_MODEL_REPOS_SRV, SYNC_WITH_MODEL_REPOS_SRV, FailureHandling.CONTINUE_ON_FAILURE)

println('RAW_RETENTION_UNITS_CD')

WS.verifyEqual(row_STG.RAW_RETENTION_UNITS_CD, RAW_RETENTION_UNITS_CD, FailureHandling.CONTINUE_ON_FAILURE)

println('RAW_RETENTION_LENGTH')

WS.verifyEqual(row_STG.RAW_RETENTION_LENGTH, RAW_RETENTION_LENGTH, FailureHandling.CONTINUE_ON_FAILURE)

println('DELTA_TYPE')

WS.verifyEqual(row_STG.DELTA_TYPE, DELTA_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('DELTA_ALLOW_REJECTS_IND')

WS.verifyEqual(row_STG.DELTA_ALLOW_REJECTS_IND, DELTA_ALLOW_REJECTS_IND, FailureHandling.CONTINUE_ON_FAILURE)
