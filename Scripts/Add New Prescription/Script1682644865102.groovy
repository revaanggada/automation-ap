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

WebUI.navigateToUrl('https://stag2-admin.itmi.id/dashboard/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_/input_Email Address_login-input__input'), 'superadmin@itmi.id')

WebUI.setEncryptedText(findTestObject('Page_/input_Email Address_login-input__input_1'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Page_/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_HOME/button_Later'))

WebUI.click(findTestObject('Page_HOME/div_Manage Lifepack Subscriptions'))

WebUI.click(findTestObject('Page_HOME/div_Add New Prescription'))

WebUI.selectOptionByValue(findTestObject('Page_Add New Prescription/select_Select Funnel CategoryE-Prescription_405940'), 
    'e-prescription', true)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Add New Prescription/span_Upload'))

WebUI.uploadFile(findTestObject('Page_Add New Prescription/span_Upload'), '/Users/it-gaadmin/Downloads/215168-resep-jelek-5808c2b1f592735e28c47260.jpeg')

WebUI.setText(findTestObject('Page_Add New Prescription/input_Name_input'), 'reva')

WebUI.click(findTestObject('Page_Add New Prescription/a_f clinicdr. Revaa, M. Kes'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_No. Handphone  No. Polis_input'), '081389143707')

WebUI.sendKeys(findTestObject('Page_Add New Prescription/input_No. Handphone  No. Polis_input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Add New Prescription/input_radio'))

WebUI.selectOptionByValue(findTestObject('Page_Add New Prescription/select_Select WarehouseLifepack ManyarEcomm_00a59f'), 
    '8', true)

WebUI.click(findTestObject('Page_Add New Prescription/span_Add Medication'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_Nama Produk_input'), 'biotin')

WebUI.click(findTestObject('Page_Add New Prescription/p_BIOTIN'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_Waktu Konsumsi_input'), 'pagi')

WebUI.click(findTestObject('Page_Add New Prescription/p_Pagi at 0700'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_SebelumSesudah Makan_input'), 'ses')

WebUI.click(findTestObject('Object Repository/Page_Add New Prescription/p_Sesudah makan'))

WebUI.selectOptionByValue(findTestObject('Page_Add New Prescription/select_Pilih RuteBelum DitentukanOralTopica_e461a1'), 
    '[object Object]', true)

WebUI.click(findTestObject('Page_Add New Prescription/div_Pilih RuteBelum DitentukanOralTopicalRe_ad48e0'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_Jumlah Total_input'), '2')

WebUI.click(findTestObject('Page_Add New Prescription/button_Simpan'))

WebUI.setText(findTestObject('Page_Add New Prescription/input_Instruksi_input'), '1')

WebUI.selectOptionByValue(findTestObject('Page_Add New Prescription/select_Pilih DosisTabletKapsulSendok Makan _f1accf'), 
    'Tablet', true)

WebUI.click(findTestObject('Object Repository/Page_Add New Prescription/div_Pilih SatuanAmpulBagBakwanBarBatangBoto_f293aa'))

WebUI.click(findTestObject('Page_Add New Prescription/button_Simpan'))

WebUI.click(findTestObject('Page_Add New Prescription/button_Submit'))

WebUI.click(findTestObject('Page_Add New Prescription/button_Konfirmasi'))

WebUI.closeBrowser()

