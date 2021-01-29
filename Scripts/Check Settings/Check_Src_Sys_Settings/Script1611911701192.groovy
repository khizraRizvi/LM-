import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.sql.Sql as Sql

// Get Count of Base Object Tables
row_SRC = CustomKeywords.'lm_dev_h.test.srcSysSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, Primary_Key)

if (DESCRIPTION.equals('') && (DESCRIPTION != null)) {
    DESCRIPTION = null
}

// Check for correct result
println('Name')

WS.verifyEqual(row_SRC.Name, Name)

println('DESCRIPTION')

WS.verifyEqual(row_SRC.DESCRIPTION, DESCRIPTION)

println('Primary_Key')

WS.verifyEqual(row_SRC.Primary_Key, Primary_Key)

println('StateManagementOveridesystem')

WS.verifyEqual(row_SRC.StateManagementOveridesystem, StateManagementOveridesystem)
