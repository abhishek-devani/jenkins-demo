// def initApp() {

//     echo "Initiating the application"

// }

// return this

// Import necessary libraries
import java.io.File

// Define a function to create a folder on the desktop
def createFolderOnDesktop(folderName) {
    def desktopPath = System.getProperty("user.home") + "/Desktop"
    def folderPath = desktopPath + "/" + folderName
    def folder = new File(folderPath)
    folder.mkdirs()
}