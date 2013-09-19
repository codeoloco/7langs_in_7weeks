class TickTackToe(gameBoard: List[String]) {

    var board: List[String] = gameBoard

    def isBoardFull():Boolean = {

        board.foreach { cell =>
            if (cell == Nil || cell.size == 0) {
                return false
            }
        }

        return true
    }

    def isWinner(player: String):Boolean = {
        return (
            (board(0) == player && board(1) == player && board(2) == player) ||
            (board(3) == player && board(4) == player && board(5) == player) ||
            (board(6) == player && board(7) == player && board(8) == player) ||
            (board(0) == player && board(3) == player && board(6) == player) ||
            (board(1) == player && board(4) == player && board(7) == player) ||
            (board(2) == player && board(5) == player && board(8) == player) ||
            (board(0) == player && board(4) == player && board(8) == player) ||
            (board(2) == player && board(4) == player && board(6) == player))
    }

    def winner() = {
        // check if x is winner
        if (isWinner("X")) {
            println("X is the winner")
        } else if (isWinner("O")) { // check if O is winner
            println("O is the winner")
        } else if (isBoardFull()) {// if x is not winner, and y is not winner
            println("We have a tie") // if board is full, then tie
        } else { // else no winner yet
            println("no winner yet")
        }
    }
}

println("*** tie test ***")
val tieGame = new TickTackToe(List("X", "0", "X", "O", "X", "O", "O", "X", "O"))
tieGame.winner

println("*** top X winner ***")
val topXGame = new TickTackToe(List("X", "X", "X", "X", "O", "O", "O", "X", "O"))
topXGame.winner

println("*** middle O winner ***")
val middleOGame = new TickTackToe(List("X", "O", "X", "O", "O", "O", "X", "X", ""))
middleOGame.winner

println("*** bottom X winner ***")
val bottomXGame = new TickTackToe(List("O", "", "", "", "O", "", "X", "X", "X"))
bottomXGame.winner

println("*** left O winner ***")
val leftOGame = new TickTackToe(List("O", "", "X", "O", "X", "", "O", "", ""))
leftOGame.winner

println("*** center X winner ***")
val centerXGame = new TickTackToe(List("O", "X", "", "", "X", "", "O", "X", ""))
centerXGame.winner

println("*** right O winner ***")
val rightOGame = new TickTackToe(List("", "", "O", "", "X", "O", "", "X", "O"))
rightOGame.winner

println("*** left diagonal X winner ***")
val leftDXGame = new TickTackToe(List("X", "O", "O", "", "X", "", "", "", "X"))
leftDXGame.winner

println("*** right diagonal O winner ***")
val rightDOGame = new TickTackToe(List("X", "", "O", "", "O", "", "O", "", "X"))
rightDOGame.winner

println("*** no winner yet ***")
val noWinnerGame = new TickTackToe(List("X", "", "O", "", "", "", "O", "", "X"))
noWinnerGame.winner


