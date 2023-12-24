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

Mobile.startApplication('C:\\Users\\Dheva\\Documents\\MedUnnes-V1.1-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.Button - Mulai Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/TC-09/android.widget.EditText - Email'), 'dhevadayatvitoindraj@mail.ugm.ac.id', 
    0)

Mobile.setText(findTestObject('Object Repository/TC-09/android.widget.EditText - Password'), 'test', 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.Button - Reject'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.TextView - Putri Azna'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.TextView - 01052021'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.TextView - Sesi 2'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.Button - Reject'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.TextView - Ya'), 0)

Mobile.tap(findTestObject('Object Repository/TC-09/android.widget.LinearLayout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/TC-09/androidx.recyclerview.widget.RecyclerView'), 0)

Mobile.closeApplication()

