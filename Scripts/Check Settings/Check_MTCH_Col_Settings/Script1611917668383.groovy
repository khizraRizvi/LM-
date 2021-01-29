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

row_MTCH = CustomKeywords.'lm_dev_h.test.mtchColumnSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, MTCH_FOR_TABLE, MC_FIELD_NAME, SELECTED_COLUMNS)

println('MTCH_FOR_TABLE =>' + row_MTCH.MTCH_FOR_TABLE)

WS.verifyEqual(row_MTCH.MTCH_FOR_TABLE, MTCH_FOR_TABLE)

println('MC_FIELD_NAME')

WS.verifyEqual(row_MTCH.MC_FIELD_NAME, MC_FIELD_NAME)

println('SELECTED_COLUMNS')

WS.verifyEqual(row_MTCH.SELECTED_COLUMNS, SELECTED_COLUMNS)

println('COLUMN_TYPE')

WS.verifyEqual(row_MTCH.COLUMN_TYPE, COLUMN_TYPE)

println('PATH_COMPONENT')

WS.verifyEqual(row_MTCH.PATH_COMPONENT, PATH_COMPONENT)



