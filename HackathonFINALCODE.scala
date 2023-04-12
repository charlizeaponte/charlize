//Always tag code
//Theme is... Fraud & Theft Protection
//PURPOSE OF THE CODE: Play Hack a Battleship: Fraud & Theft Protection
// Identity Theft: Error 404 Security Measures Not Found
//Name.jpg (Se Se, Charlize, Zavier, Hope)

import io.StdIn._
import scala.util.Random


object HackBattleship
{
    def main(args: Array[String]) =
    {
        println("By Name.jpg ...")
        Thread.sleep(3000)

        println("Welcome to...")
        Thread.sleep(3000)

        //intro stuff
        println(""" /$$$$$$ /$$$$$$$  /$$$$$$$$ /$$   /$$ /$$$$$$$$ /$$$$$$ /$$$$$$$$ /$$     /$$       /$$$$$$$$ /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$$$""")
        println("""|_  $$_/| $$__  $$| $$_____/| $$$ | $$|__  $$__/|_  $$_/|__  $$__/|  $$   /$$/      |__  $$__/| $$  | $$| $$_____/| $$_____/|__  $$__/""")
        println("""  | $$  | $$  \ $$| $$      | $$$$| $$   | $$     | $$     | $$    \  $$ /$$/          | $$   | $$  | $$| $$      | $$         | $$   """)
        println("""  | $$  | $$  | $$| $$$$$   | $$ $$ $$   | $$     | $$     | $$     \  $$$$/           | $$   | $$$$$$$$| $$$$$   | $$$$$      | $$   """)
        println("""  | $$  | $$  | $$| $$__/   | $$  $$$$   | $$     | $$     | $$      \  $$/            | $$   | $$__  $$| $$__/   | $$__/      | $$   """)
        println("""  | $$  | $$  | $$| $$      | $$\  $$$   | $$     | $$     | $$       | $$             | $$   | $$  | $$| $$      | $$         | $$   """)
        println(""" /$$$$$$| $$$$$$$/| $$$$$$$$| $$ \  $$   | $$    /$$$$$$   | $$       | $$             | $$   | $$  | $$| $$$$$$$$| $$         | $$   """)
        println("""|______/|_______/ |________/|__/  \__/   |__/   |______/   |__/       |__/             |__/   |__/  |__/|________/|__/         |__/   """)
        println("\n --------------------------------------------------ERROR 404: SECURITY NOT FOUND----------------------------------------------------------")

        Thread.sleep(3000)

        println("Enter coordinates in XX format of a letter and a number to hack the mainframe! Use capital letters matching the coordinates listed on the grid.\nIf you successfully hit a byte of data, you will not lose a hack attempt. Get all the information before you're caught! \nGood luck!")

        Thread.sleep(10000)

        //defining variables
        val arrA = Array[String]("A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9")
        val arrB = Array[String]("B0", "B1", "B2" ,"B3", "B4", "B5", "B6" ,"B7", "B8", "B9")
        val arrC = Array[String]("C0", "C1", "C2" ,"C3", "C4", "C5", "C6" ,"C7", "C8", "C9")
        val arrD = Array[String]("D0", "D1", "D2" ,"D3", "D4", "D5", "D6" ,"D7", "D8", "D9")
        val arrE = Array[String]("E0", "E1", "E2" ,"E3", "E4", "E5", "E6" ,"E7", "E8", "E9")
        val arrF = Array[String]("F0", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9")
        val arrG = Array[String]("G0", "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9")
        val arrH = Array[String]("H0", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9")
        val arrI = Array[String]("I0", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9")
        val arrJ = Array[String]("J0", "J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9")


        val shipLocations = shipLocationGenerator()
        //val shipNames= ("FullName" ,"SocialsecurityNumber", " MothersMaidenName" , "FirstPetsName")
        //parse function taking user coordinate input (A4), outputing cords (arrA(4))

        var bullets = 20

        val turnsTaken = gameLoop( bullets , arrA , arrB, arrC, arrD, arrE, arrF, arrG, arrH, arrI, arrJ , shipLocations) //75 is num of bullets
        //grid generation inputs spaces hit, outputs

    }


    def gameLoop (bullets:Int , arrA: Array[String] , arrB: Array[String], arrC: Array[String], arrD: Array[String], arrE: Array[String] ,arrF: Array[String], arrG: Array[String], arrH: Array[String], arrI: Array[String], arrJ: Array[String] , shipLocations: Array[String]):(Int) =
    {

        if (bullets >= 1)
        {

            gridGeneration(arrA, arrB, arrC, arrD, arrE, arrF, arrG, arrH, arrI, arrJ) //prints grid

            println(s"You have $bullets hack attempts remaining...")
            println("Enter Target That You Want To Hack:")
            val inputString = readLine()

            val hit:Boolean = parseCoordinates(inputString, shipLocations , arrA, arrB, arrC, arrD, arrE, arrF, arrG, arrH, arrI, arrJ)

            if (hit == true)
                println("you hit something!")

                val turns = gameLoop(bullets , arrA, arrB, arrC, arrD, arrE, arrF, arrG, arrH, arrI, arrJ, shipLocations)


            /*    //prints if ship sunk, not workin
                if (shipLocations(0) == "❌" && shipLocations(1) == "❌" && shipLocations(2) == "❌" && shipLocations(3) == "❌") //full name sunk
                {
                    println("You've discovered their FULL NAME!")
                }
                else

                if (shipLocations(4) == "❌" && shipLocations(5) == "❌") //pet name
                {
                    println("You've discovered their PET'S NAME!")
                }
                else

                if (shipLocations(6) == "❌" && shipLocations(7) == "❌" && shipLocations(8) == "❌")  //SNN
                {
                    println("You've discovered their SOCIAL SECURITY NUMBER!")
                }
                else

                if (shipLocations(9) == "❌" && shipLocations(10) == "❌" && shipLocations(11) == "❌" && shipLocations(12) == "❌")  //Mothers maiden name
                {
                    println("You've discovered their MOTHERS MAIDEN NAME!")
                }
            */

            else
                println("You did not hit anything!")

                val turns = gameLoop(bullets - 1 , arrA, arrB, arrC, arrD, arrE, arrF, arrG, arrH, arrI, arrJ, shipLocations)

        }
        else
        //outta bullets
        println(" ")
        println("""  /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$$$        /$$$$$$  /$$    /$$ /$$$$$$$$ /$$$$$$$ """)
        println(""" /$$__  $$ /$$__  $$| $$$    /$$$| $$_____/       /$$__  $$| $$   | $$| $$_____/| $$__  $$""")
        println("""| $$  \__/| $$  \ $$| $$$$  /$$$$| $$            | $$  \ $$| $$   | $$| $$      | $$  \ $$""")
        println("""| $$ /$$$$| $$$$$$$$| $$ $$/$$ $$| $$$$$         | $$  | $$|  $$ / $$/| $$$$$   | $$$$$$$/""")
        println("""| $$|_  $$| $$__  $$| $$  $$$| $$| $$__/         | $$  | $$ \  $$ $$/ | $$__/   | $$__  $$""")
        println("""| $$  \ $$| $$  | $$| $$\  $ | $$| $$            | $$  | $$  \  $$$/  | $$      | $$  \ $$""")
        println("""|  $$$$$$/| $$  | $$| $$ \/  | $$| $$$$$$$$      |  $$$$$$/   \  $/   | $$$$$$$$| $$  | $$""")
        println(""" \______/ |__/  |__/|__/     |__/|________/       \______/     \_/    |________/|__/  |__/""")
        println(" ")

        (0)


    }

    def gridGeneration (a: Array[String] , b: Array[String] , c: Array[String] ,d: Array[String] ,e: Array[String] ,f: Array[String] ,g: Array[String] ,h: Array[String] ,i: Array[String], j: Array[String]) =
    {
        println( "_|__________________")
        println(s"A|" + a.mkString)
        println(s"B|" + b.mkString)
        println(s"C|" + c.mkString)
        println(s"D|" + d.mkString)
        println(s"E|" + e.mkString)
        println(s"F|" + f.mkString)
        println(s"G|" + g.mkString)
        println(s"H|" + h.mkString)
        println(s"I|" + i.mkString)
        println(s"J|" + j.mkString)
        println( "_____________________")
        println(" 0 1 2 3 4 5 6 7 8 9 ")


    }

    def parseCoordinates (input:String, shipLocations: Array[String] , arrA: Array[String] , arrB: Array[String], arrC: Array[String], arrD: Array[String], arrE: Array[String] ,arrF: Array[String], arrG: Array[String], arrH: Array[String], arrI: Array[String], arrJ: Array[String]):(Boolean) =  //parsing cord and marking Hit
    {
        val firstCord = input.charAt(0) //Letter
        val secCord = input.substring(1,2).toInt //Number

        firstCord match
        {
            case 'A' =>
            {
                //val spaceHit = arrA(secCord.toInt)

                if (shipLocations contains input) //hits something
                {
                    arrA(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrA(secCord) = "⭕️"
                    (false)
                }
            }

            case 'B' =>
            {

                if (shipLocations contains input) //hits something
                {
                    arrB(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrB(secCord) = "⭕️"
                    (false)
                }
            }
            case 'C' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrC(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrC(secCord) = "⭕️"
                    (false)
                }
            }
             case 'D' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrD(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrD(secCord) = "⭕️"
                    (false)
                }
            }
             case 'E' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrE(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrE(secCord) = "⭕️"
                    (false)
                }
            }
            case 'F' =>
            {
                if (shipLocations contains input)//hits something
                {
                    arrF(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrF(secCord) = "⭕️"
                    (false)
                }
            }
            case 'G' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrG(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrG(secCord) = "⭕️"
                    (false)
                }
            }
            case 'H' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrH(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrH(secCord) = "⭕️"
                    (false)
                }
            }
            case 'I' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrI(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrI(secCord) = "⭕️"
                    (false)
                }
            }
            case 'J' =>
            {
                if (shipLocations contains input) //hits something
                {
                    arrJ(secCord) = "❌"
                    (true)
                }
                else //does not hit anything
                {
                    arrJ(secCord) = "⭕️"
                    (false)
                }
            }
        }
    }

    def shipLocationGenerator ():(Array[String]) = //array returned is shipLocations)
    {

        val (spot1, spot2, spot3, spot4) = randomFNLoc()
        val (spot5, spot6) = randomPetName(spot1, spot2, spot3, spot4)
        val overlapArr1 = Array[String](spot1, spot2, spot3, spot4, spot5, spot6)
        val (spot7, spot8, spot9) = randomSSNloc(overlapArr1)
        val overlapArr2 = Array[String](spot1, spot2, spot3, spot4, spot5, spot6, spot7, spot8, spot9)
        val (spot10, spot11, spot12, spot13) = mothersMaidenName(overlapArr2)

        val returnArr = Array[String](spot1, spot2, spot3, spot4, spot5, spot6, spot7, spot8, spot9, spot10, spot11, spot12, spot13)
        (returnArr)
        //spot 1-4 full name, spot 5-6 pet name, spot 7-9 is SSN, spot 10-13 is MMN

    }
    def mothersMaidenName (overlap:Array[String]):(String, String, String, String) =
    {
        var randomLetter:Int = Random.between(0,5)
        val randomNumber = Random.between(0,10)
        var letter:String = ""

        letter = matchRanLetter(randomLetter)

        val spot1:String = (letter + randomNumber)
        //gets letter of coordinate below
        randomLetter = randomLetter + 1
        letter = matchRanLetter(randomLetter)
        val spot2:String = (letter + randomNumber)

        randomLetter = randomLetter + 1
        letter = matchRanLetter(randomLetter)
        val spot3:String = (letter + randomNumber)

        randomLetter = randomLetter + 1
        letter = matchRanLetter(randomLetter)
        val spot4:String = (letter + randomNumber)

        if ((overlap contains spot1) || (overlap contains spot2) || (overlap contains spot3) || (overlap contains spot4))
            (mothersMaidenName(overlap))

        else
            (spot1, spot2, spot3, spot4)

    }

    def randomSSNloc (overlap:Array[String]):(String, String, String) =
    {
        val randomLetter = Random.between(0,10)
        val randomLeftSpace = Random.between(0,5)
        var letter:String = ""

        letter = matchRanLetter(randomLetter)

        val spot1:String = (letter + randomLeftSpace)
        val spot2:String = (letter + (randomLeftSpace + 1))
        val spot3:String = (letter + (randomLeftSpace + 2))

        if ((overlap contains spot1) || (overlap contains spot2 )||( overlap contains spot3))
            (randomSSNloc(overlap))
        else
            (spot1, spot2, spot3)

    }

    def randomFNLoc ():(String, String, String, String) =
    {
        val randomLetter = Random.between(0,10)
        val randomLeftSpace = Random.between(0,6)
        var letter:String = ""

        letter = matchRanLetter(randomLetter)

        val spot1 = (letter + randomLeftSpace)
        val spot2 = (letter + (randomLeftSpace + 1))
        val spot3 = (letter + (randomLeftSpace + 2))
        val spot4 = (letter + (randomLeftSpace + 3))

        (spot1, spot2, spot3, spot4)


    }
    //generate random pet name location that does not overlap
    def randomPetName(spot1:String , spot2:String , spot3:String , spot4:String):(String, String) =
    {
        var randomLetter = Random.between(0,9)
        val randomNumber = Random.between(0,10)
        var letter:String = ""

        letter = matchRanLetter(randomLetter)

        val spot5:String = (letter + randomNumber)
        //gets letter of coordinate below
        randomLetter = randomLetter + 1

        letter = matchRanLetter(randomLetter)
        val spot6:String = (letter + randomNumber)

        //no overlap
        if((spot5 != spot1 || spot5 != spot2 || spot5 != spot3 || spot5 != spot4) && (spot6 != spot1 || spot6 != spot2 || spot6 != spot3 || spot6 != spot4))
            (spot5, spot6)

        //overlap
        else
            (randomPetName(spot1, spot2, spot3, spot4))


    }

    def matchRanLetter (randomLetter:Int):(String) =
    {
        randomLetter match // 0-9 cases for the 10 letter values
        {
            case 0 =>
            {
                val letter = "A"
                (letter)
            }

            case 1 =>
            {
                val letter = "B"
                (letter)
            }

            case 2 =>
            {
                val letter = "C"
                (letter)
            }

            case 3 =>
            {
                val letter = "D"
                (letter)
            }

            case 4 =>
            {
                val letter = "E"
                (letter)
            }

            case 5 =>
            {
                val letter = "F"
                (letter)
            }

            case 6 =>
            {
                val letter = "G"
                (letter)
            }

            case 7 =>
            {
                val letter = "H"
                (letter)
            }

            case 8 =>
            {
                val letter = "I"
                (letter)
            }

            case 9 =>
            {
                val letter = "J"
                (letter)
            }
        }
    }
}
