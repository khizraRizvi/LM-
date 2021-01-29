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

row_Mtch = CustomKeywords.'lm_dev_h.test.mtchPrprtySttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, 'TABLE_NAME')

println('TABLE_NAME')

WS.verifyEqual(row_Mtch.TABLE_NAME, TABLE_NAME)

println('MANUAL_MERGE_QUEUE_SIZE')

WS.verifyEqual(row_Mtch.MANUAL_MERGE_QUEUE_SIZE, MANUAL_MERGE_QUEUE_SIZE, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_BATCH_SIZE')

WS.verifyEqual(row_Mtch.MATCH_BATCH_SIZE, MATCH_BATCH_SIZE, FailureHandling.CONTINUE_ON_FAILURE)

println('ACCEPT_NONMATCH_UNIQUE_IND')

WS.verifyEqual(row_Mtch.ACCEPT_NONMATCH_UNIQUE_IND, ACCEPT_NONMATCH_UNIQUE_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('EXACT_MATCH_OBJECT_IND')

WS.verifyEqual(row_Mtch.EXACT_MATCH_OBJECT_IND, EXACT_MATCH_OBJECT_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_POPULATION_STR')

WS.verifyEqual(row_Mtch.MATCH_POPULATION_STR, MATCH_POPULATION_STR, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_LESS_THAN_IND')

WS.verifyEqual(row_Mtch.MATCH_LESS_THAN_IND, MATCH_LESS_THAN_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_ONLY_ONCE_IND')

WS.verifyEqual(row_Mtch.MATCH_ONLY_ONCE_IND, MATCH_ONLY_ONCE_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_DYNAMIC_ANALYSIS_IND')

WS.verifyEqual(row_Mtch.MATCH_DYNAMIC_ANALYSIS_IND, MATCH_DYNAMIC_ANALYSIS_IND, FailureHandling.CONTINUE_ON_FAILURE)

println('MATCH_PENDING_IND')

WS.verifyEqual(row_Mtch.MATCH_PENDING_IND, MATCH_PENDING_IND, FailureHandling.CONTINUE_ON_FAILURE)

