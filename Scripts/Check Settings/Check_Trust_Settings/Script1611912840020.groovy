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

row_TRUST = CustomKeywords.'lm_dev_h.test.srcTrustSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, TABLE_NAME, COLUMN_NAME, SYSTEM)

println('TABLE_NAME')

WS.verifyEqual(row_TRUST.TABLE_NAME, TABLE_NAME)

println('COLUMN_NAME')

WS.verifyEqual(row_TRUST.COLUMN_NAME, COLUMN_NAME)

println('SYSTEM')

WS.verifyEqual(row_TRUST.SYSTEM, SYSTEM)

println('maximum')

WS.verifyEqual(row_TRUST.maximum, maximum)

println('minimum')

WS.verifyEqual(row_TRUST.minimum, minimum)

println('units')

WS.verifyEqual(row_TRUST.units, units)

println('decay')

WS.verifyEqual(row_TRUST.decay, decay)

println('graph_type')

WS.verifyEqual(row_TRUST.graph_type, graph_type)