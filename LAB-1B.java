package BM23AI045;

public class chessboard {
    public chessboard() {
    }

    public void printChessboard() {
        for(int i = 0; i < 8; ++i) {
            for(int j = 0; j < 8; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        chessboard chessboard = new chessboard();
        chessboard.printChessboard();
    }
}

//OUTPUT:
B W B W B W B W 
W B W B W B W B 
B W B W B W B W 
W B W B W B W B 
B W B W B W B W 
W B W B W B W B 
B W B W B W B W 
W B W B W B W B 

Process finished with exit code 0
