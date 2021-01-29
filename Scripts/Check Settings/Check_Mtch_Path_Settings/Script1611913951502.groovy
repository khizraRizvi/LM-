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

row_MTCH = CustomKeywords.'lm_dev_h.test.mtchPathSttng'(GlobalVariable.ora_connect, GlobalVariable.ora_username, GlobalVariable.ora_password, 
    GlobalVariable.ora_schema, Base_Object_Table, Parent_Table_Name, Child_Table_Name)

println('Base_Object_Table =>' + Base_Object_Table)

WS.verifyEqual(row_MTCH.Base_Object_Table, Base_Object_Table)

println('Parent_Component_Name')

WS.verifyEqual(row_MTCH.Parent_Component_Name, Parent_Component_Name)

println('match_path_component_name')

WS.verifyEqual(row_MTCH.match_path_component_name, match_path_component_name)

println('Parent_Table_Name')

WS.verifyEqual(row_MTCH.Parent_Table_Name, Parent_Table_Name)

println('Child_Table_Name')

WS.verifyEqual(row_MTCH.Child_Table_Name, Child_Table_Name)

println('Check_Missing_Child')

WS.verifyEqual(row_MTCH.Check_Missing_Child, Check_Missing_Child)

