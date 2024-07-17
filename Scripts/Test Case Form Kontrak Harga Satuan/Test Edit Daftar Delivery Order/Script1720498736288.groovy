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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.7.1.169/')

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8'), 
    'admin')

WebUI.takeFullPageScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1'), 
    'RAIVpflpDOg=')

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management'))

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Kontrak Harga Satuan'))

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/td_Test'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit'))

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/td'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit_1'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Judul Kontrak_judulKontrak'), 
    'do satu')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No DO_text-sm text-color p-2 border-1_f9ba00'), 
    'do0001')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nilai DO (Rp)_integeronly'), 
    '500')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nilai DO (Rp)_integeronly'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No DO_text-sm text-color p-2 border-1_f9ba00'), 
    'po0001')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Tim Tes 1_p-dropdown-trigger ng-tns-c70-50'))

WebUI.takeFullPageScreenshot()

WebUI.clickOffset(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/span_TIM TEST 2_p-ink p-ink-active'), 
    0, 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Tim Pemeriksa Pekerjaan PLTU Tembilahan_4fa025'))

WebUI.takeFullPageScreenshot()

WebUI.clickOffset(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/li_Tim Pemeriksa Penyelesaian Pekerjaan'), 
    0, 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/div_DIVBSS_p-dropdown-trigger ng-tns-c70-52'))

WebUI.takeFullPageScreenshot()

WebUI.clickOffset(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/span_BMUM_p-ink p-ink-active'), 
    0, 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Delivery Order/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Simpan'))

WebUI.takeFullPageScreenshot()

