The Database Operation test. This test mainly tests the function of the following aspects: the first is to test whether the database is connected successfully. We write a text on the D disk, the second is to test the number of device and the number of grid ports in the database. 
 
The Message Encryption and Decryption Function test. This test we write two functions, one is base 64 encryption and decryption, the other is des encryption and decryption. About the base 64 encrypt, we test the ¡°112233¡±, we need to get the consequence is ¡°112233¡±, too. About the base 64 decrypt, we test the ¡°MTEyMjMz¡±, we need to get the consequence is ¡°MTEyMjMz¡±. About the des encrypt, we test the key is "auaspp01" and the input is "test", we need to get the consequence is "auaspp01" and input is "test" . About the des decrypt, we test the key is "auaspp01" and input is "3D2EFVw7Jrk=", we need to get the consequence is "auaspp01" and input is "3D2EFVw7Jrk=". 
 
The CPipeHelpTest. This function is that in order to restart the software when the system crashes, the terminal software writes the current timestamp to the pip. The software watchdog obtains this value for judgment. We can regard it as a file, a write, a read. 
 
The CTxtHelpTest. This test is Logging function, Our main test is appendlog, we need to get the consequence of the appendlog is right or wrong, then, we test the createTxtFile, we need to get the consequence of the createTxtFile is right or wrong, finally, we test the path, and we get the consequence of the path is SuperBox\CommondLib\soft\log_run. 
 
The CBaseTimeTest. This function is that Countdown test. We design the 10 seconds to test, the 10 seconds is 50 to 59. 
