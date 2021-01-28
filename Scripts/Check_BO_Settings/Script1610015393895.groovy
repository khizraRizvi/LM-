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

row_BO = CustomKeywords.'lm_dev_h.test.bo_Sttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME)

if (DESCRIPTION.equals('') && (DESCRIPTION != null)) {
    DESCRIPTION = null
}

// Check for correct result
println('DISPLAY_NAME')

WS.verifyEqual(row_BO.DISPLAY_NAME, DISPLAY_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DATA_SPACE_NAME')

WS.verifyEqual(row_BO.DATA_SPACE_NAME, DATA_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('INDEX_SPACE_NAME')

WS.verifyEqual(row_BO.INDEX_SPACE_NAME, INDEX_SPACE_NAME, FailureHandling.CONTINUE_ON_FAILURE)

println('DESCRIPTION')

WS.verifyEqual(row_BO.DESCRIPTION, DESCRIPTION, FailureHandling.CONTINUE_ON_FAILURE)

println('TABLE_TYPE')

WS.verifyEqual(row_BO.TABLE_TYPE, TABLE_TYPE, FailureHandling.CONTINUE_ON_FAILURE)

println('ENABLE_HISTORY')

WS.verifyEqual(row_BO.ENABLE_HISTORY, ENABLE_HISTORY, FailureHandling.CONTINUE_ON_FAILURE)

println('TIMELINE')

WS.verifyEqual(row_BO.TIMELINE, TIMELINE, FailureHandling.CONTINUE_ON_FAILURE)

println('NON_CONTIGUOUS_IND')

WS.verifyEqual(row_BO.NON_CONTIGUOUS_IND, NON_CONTIGUOUS_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('COMPLETE_TOKENIZE_RATIO')

WS.verifyEqual(row_BO.COMPLETE_TOKENIZE_RATIO, COMPLETE_TOKENIZE_RATIO, FailureHandling.CONTINUE_ON_FAILURE)

println('DISABLE_CONSTRAINT_IND')

WS.verifyEqual(row_BO.DISABLE_CONSTRAINT_IND, DISABLE_CONSTRAINT_IND, FailureHandling.CONTINUE_ON_FAILURE)

not_run: println('DUPLICATE_MATCH_THRESHOLD')

not_run: WS.verifyEqual(row_BO.DUPLICATE_MATCH_THRESHOLD, DUPLICATE_MATCH_THRESHOLD, FailureHandling.CONTINUE_ON_FAILURE)

println('LOAD_BATCH_SIZE')

WS.verifyEqual(row_BO.LOAD_BATCH_SIZE, LOAD_BATCH_SIZE, FailureHandling.CONTINUE_ON_FAILURE)

println('MAX_ELAPSED_MATCH_MINUTES')

WS.verifyEqual(row_BO.MAX_ELAPSED_MATCH_MINUTES, MAX_ELAPSED_MATCH_MINUTES, FailureHandling.CONTINUE_ON_FAILURE)

println('PARALLEL_DEGREE')

WS.verifyEqual(row_BO.PARALLEL_DEGREE, PARALLEL_DEGREE, FailureHandling.CONTINUE_ON_FAILURE)

println('REQUEUE_ON_PARENT_MERGE_IND')

WS.verifyEqual(row_BO.REQUEUE_ON_PARENT_MERGE_IND, REQUEUE_ON_PARENT_MERGE_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('GENERATE_TOKEN_ON_LOAD')

WS.verifyEqual(row_BO.GENERATE_TOKEN_ON_LOAD, GENERATE_TOKEN_ON_LOAD, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_FLAG_AUDIT_IND')

WS.verifyEqual(row_BO.MATCH_FLAG_AUDIT_IND, MATCH_FLAG_AUDIT_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('API_LOCK_WAIT_SECONDS')

WS.verifyEqual(row_BO.API_LOCK_WAIT_SECONDS, API_LOCK_WAIT_SECONDS, FailureHandling.CONTINUE_ON_FAILURE)

println('BATCH_LOCK_WAIT_SECONDS')

WS.verifyEqual(row_BO.BATCH_LOCK_WAIT_SECONDS, BATCH_LOCK_WAIT_SECONDS, FailureHandling.CONTINUE_ON_FAILURE)

println('STATE_MANAGEMENT_IND')

WS.verifyEqual(row_BO.STATE_MANAGEMENT_IND, STATE_MANAGEMENT_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('HIST_XREF_PROMOTION')

WS.verifyEqual(row_BO.HIST_XREF_PROMOTION, HIST_XREF_PROMOTION, FailureHandling.CONTINUE_ON_FAILURE)

not_run: println('BASE_OBJECT_STYLE')

not_run: WS.verifyEqual(row_BO.BASE_OBJECT_STYLE, BASE_OBJECT_STYLE, FailureHandling.CONTINUE_ON_FAILURE)

not_run: println('LINK_MANAGEMENT')

not_run: WS.verifyEqual(row_BO.LINK_MANAGEMENT, LINK_MANAGEMENT, FailureHandling.CONTINUE_ON_FAILURE)

println('LOOKUP_IND')

WS.verifyEqual(row_BO.LOOKUP_IND, LOOKUP_IND, FailureHandling.CONTINUE_ON_FAILURE)
