import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Board.java
 *
 * Connect 4 Game
 *
 * @author Enliang Wu
 */

public class Board extends Application

{
    private Label result;
    private final int chessSize = 70;
    private final int column = 7;
    private final int row = 6;
    private int num = 0;
    private Circle circle;
    private Circle circle2D[][] = new Circle[row][column];
    private GridPane grid;
    private Button button0 = new Button( "" );
    private Button button1 = new Button( "" );
    private Button button2 = new Button( "" );
    private Button button3 = new Button( "" );
    private Button button4 = new Button( "" );
    private Button button5 = new Button( "" );
    private Button button6 = new Button( "" );
    private Button buttonReset = new Button("Reset");

    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        button0 = new Button( "0" );
        button1 = new Button( "1" );
        button2 = new Button( "2" );
        button3 = new Button( "3" );
        button4 = new Button( "4" );
        button5 = new Button( "5" );
        button6 = new Button( "6" );
        this.result = new Label();
        this.result.setText("");
        primaryStage.setTitle("Connect 4 by Enliang Wu");
        primaryStage.show();
        this.grid = new GridPane();
        this.grid.setVgap(10);
        this.grid.setHgap(10);
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                this.circle = new Circle();
                circle.setRadius(chessSize/2);
                circle.setStrokeWidth(5);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                circle2D[i][j] = circle;
            }
        }
        GridPane.setConstraints(circle2D[0][0], 0,0);
        GridPane.setConstraints(circle2D[0][1], 1,0);
        GridPane.setConstraints(circle2D[0][2], 2,0);
        GridPane.setConstraints(circle2D[0][3], 3,0);
        GridPane.setConstraints(circle2D[0][4], 4,0);
        GridPane.setConstraints(circle2D[0][5], 5,0);
        GridPane.setConstraints(circle2D[0][6], 6,0);
        GridPane.setConstraints(circle2D[1][0], 0,1);
        GridPane.setConstraints(circle2D[1][1], 1,1);
        GridPane.setConstraints(circle2D[1][2], 2,1);
        GridPane.setConstraints(circle2D[1][3], 3,1);
        GridPane.setConstraints(circle2D[1][4], 4,1);
        GridPane.setConstraints(circle2D[1][5], 5,1);
        GridPane.setConstraints(circle2D[1][6], 6,1);
        GridPane.setConstraints(circle2D[2][0], 0,2);
        GridPane.setConstraints(circle2D[2][1], 1,2);
        GridPane.setConstraints(circle2D[2][2], 2,2);
        GridPane.setConstraints(circle2D[2][3], 3,2);
        GridPane.setConstraints(circle2D[2][4], 4,2);
        GridPane.setConstraints(circle2D[2][5], 5,2);
        GridPane.setConstraints(circle2D[2][6], 6,2);
        GridPane.setConstraints(circle2D[3][0], 0,3);
        GridPane.setConstraints(circle2D[3][1], 1,3);
        GridPane.setConstraints(circle2D[3][2], 2,3);
        GridPane.setConstraints(circle2D[3][3], 3,3);
        GridPane.setConstraints(circle2D[3][4], 4,3);
        GridPane.setConstraints(circle2D[3][5], 5,3);
        GridPane.setConstraints(circle2D[3][6], 6,3);
        GridPane.setConstraints(circle2D[4][0], 0,4);
        GridPane.setConstraints(circle2D[4][1], 1,4);
        GridPane.setConstraints(circle2D[4][2], 2,4);
        GridPane.setConstraints(circle2D[4][3], 3,4);
        GridPane.setConstraints(circle2D[4][4], 4,4);
        GridPane.setConstraints(circle2D[4][5], 5,4);
        GridPane.setConstraints(circle2D[4][6], 6,4);
        GridPane.setConstraints(circle2D[5][0], 0,5);
        GridPane.setConstraints(circle2D[5][1], 1,5);
        GridPane.setConstraints(circle2D[5][2], 2,5);
        GridPane.setConstraints(circle2D[5][3], 3,5);
        GridPane.setConstraints(circle2D[5][4], 4,5);
        GridPane.setConstraints(circle2D[5][5], 5,5);
        GridPane.setConstraints(circle2D[5][6], 6,5);

        grid.getChildren().addAll(circle2D[0][0],circle2D[0][1],circle2D[0][2],
                circle2D[0][3],circle2D[0][4],circle2D[0][5],circle2D[0][6],
                circle2D[1][0],circle2D[1][1],circle2D[1][2],circle2D[1][3],
                circle2D[1][4],circle2D[1][5],circle2D[1][6], circle2D[2][0], circle2D[2][1],
                circle2D[2][2],circle2D[2][3],circle2D[2][4],circle2D[2][5],
                circle2D[2][6],circle2D[3][0],circle2D[3][1],circle2D[3][2],circle2D[3][3],
                circle2D[3][4],circle2D[3][5],circle2D[3][6],circle2D[4][0],
                circle2D[4][1],circle2D[4][2],circle2D[4][3],circle2D[4][4],
                circle2D[4][5],circle2D[4][6],circle2D[5][0],circle2D[5][1],
                circle2D[5][2],circle2D[5][3],circle2D[5][4],circle2D[5][5], circle2D[5][6]);

        button0.setOnAction( new buttonHandler0() );
        button1.setOnAction( new buttonHandler1() );
        button2.setOnAction( new buttonHandler2() );
        button3.setOnAction( new buttonHandler3() );
        button4.setOnAction( new buttonHandler4() );
        button5.setOnAction( new buttonHandler5() );
        button6.setOnAction( new buttonHandler6() );
        buttonReset.setOnAction(new buttonHandler7());

        HBox hBox = new HBox(58, button0, button1, button2,button3,button4,button5, button6);
        VBox vBox = new VBox(10, result, grid, hBox, buttonReset);
        vBox.setPadding( new Insets( 300 ) );
        vBox.setAlignment( Pos.CENTER );
        hBox.setAlignment( Pos.CENTER );
        Scene scene = new Scene(vBox);
        primaryStage.setScene( scene );
    }
    public void setButtonToNull ()
    {
        button0.setOnAction(null);
        button1.setOnAction(null);
        button2.setOnAction(null);
        button3.setOnAction(null);
        button4.setOnAction(null);
        button5.setOnAction(null);
        button6.setOnAction(null);
    }
    public void setButton ()
    {
        button0.setOnAction( new buttonHandler0() );
        button1.setOnAction( new buttonHandler1() );
        button2.setOnAction( new buttonHandler2() );
        button3.setOnAction( new buttonHandler3() );
        button4.setOnAction( new buttonHandler4() );
        button5.setOnAction( new buttonHandler5() );
        button6.setOnAction( new buttonHandler6() );
    }

    public void checkWinner()
    {
        //horizontally
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (circle2D[i][j].getFill() == Color.RED && circle2D[i][j+1].getFill() == Color.RED
                        && circle2D[i][j+2].getFill() == Color.RED &&circle2D[i][j+3].getFill() == Color.RED)
                {
                    System.out.println("Red Wins!");
                    result.setText("Red Wins!");
                    setButtonToNull();
                    return;
                }
                else if (circle2D[i][j].getFill() == Color.BLACK && circle2D[i][j+1].getFill() == Color.BLACK
                        && circle2D[i][j+2].getFill() == Color.BLACK &&circle2D[i][j+3].getFill() == Color.BLACK)
                {
                    System.out.println("Black Wins!");
                    result.setText("Black Wins!");
                    setButtonToNull();
                    return;
                }
            }
        }

        //vertically
        for (int j = 0; j < column; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                if (circle2D[i][j].getFill() == Color.RED && circle2D[i+1][j].getFill() == Color.RED
                        && circle2D[i+2][j].getFill() == Color.RED &&circle2D[i+3][j].getFill() == Color.RED)
                {
                    System.out.println("Red Wins!");
                    result.setText("Red Wins!");
                    setButtonToNull();
                    return;
                }
                else if (circle2D[i][j].getFill() == Color.BLACK && circle2D[i+1][j].getFill() == Color.BLACK
                        && circle2D[i+2][j].getFill() == Color.BLACK &&circle2D[i+3][j].getFill() == Color.BLACK)
                {
                    System.out.println("Black Wins!");
                    result.setText("Black Wins!");
                    setButtonToNull();
                    return;
                }
            }
        }

        //diagonallyToRight
        for (int i = 0; i < row - 3; i++)
        {
            for (int j = 0; j < column - 3; j++)
            {
                if (circle2D[i][j].getFill() == Color.RED && circle2D[i+1][j+1].getFill() == Color.RED
                        && circle2D[i+2][j+2].getFill() == Color.RED &&circle2D[i+3][j+3].getFill() == Color.RED)
                {
                    System.out.println("Red Wins!");
                    result.setText("Red Wins!");
                    setButtonToNull();
                    return;
                }
                else if (circle2D[i][j].getFill() == Color.BLACK && circle2D[i+1][j+1].getFill() == Color.BLACK
                        && circle2D[i+2][j+2].getFill() == Color.BLACK &&circle2D[i+3][j+3].getFill() == Color.BLACK)
                {
                    System.out.println("Black Wins!");
                    result.setText("Black Wins!");
                    setButtonToNull();
                    return;
                }
            }
        }

        //diagonallyToLeft
        for (int i = 0; i < row - 3; i++)
        {
            for (int j = 3; j < column; j++)
            {
                if (circle2D[i][j].getFill() == Color.RED && circle2D[i+1][j-1].getFill() == Color.RED
                        && circle2D[i+2][j-2].getFill() == Color.RED &&circle2D[i+3][j-3].getFill() == Color.RED)
                {
                    System.out.println("Red Wins!");
                    result.setText("Red Wins!");
                    setButtonToNull();
                    return;
                }
                if (circle2D[i][j].getFill() == Color.BLACK && circle2D[i+1][j-1].getFill() == Color.BLACK
                        && circle2D[i+2][j-2].getFill() == Color.BLACK &&circle2D[i+3][j-3].getFill() == Color.BLACK)
                {
                    System.out.println("Black Wins!");
                    result.setText("Black Wins!");
                    setButtonToNull();
                    return;
                }
            }
        }

        //tie
        //boolean signal = false;
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 6; j >= 0; j--)
            {
                if(circle2D[i][j].getFill() == Color.WHITE)
                {
                    return;
                }
                else if(i == 0 && j == 0)
                {
                    System.out.println("It's a tie!");
                    result.setText("Black Wins!");
                    setButtonToNull();
                }
            }
        }
        return;
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    class buttonHandler0 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][0].getFill() == Color.WHITE)
                    {
                        circle2D[i][0].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][0].getFill() == Color.WHITE)
                    {
                        circle2D[i][0].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler1 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][1].getFill() == Color.WHITE)
                    {
                        circle2D[i][1].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][1].getFill() == Color.WHITE)
                    {
                        circle2D[i][1].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler2 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][2].getFill() == Color.WHITE)
                    {
                        circle2D[i][2].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][2].getFill() == Color.WHITE)
                    {
                        circle2D[i][2].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler3 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][3].getFill() == Color.WHITE)
                    {
                        circle2D[i][3].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][3].getFill() == Color.WHITE)
                    {
                        circle2D[i][3].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler4 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][4].getFill() == Color.WHITE)
                    {
                        circle2D[i][4].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][4].getFill() == Color.WHITE)
                    {
                        circle2D[i][4].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler5 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][5].getFill() == Color.WHITE)
                    {
                        circle2D[i][5].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][5].getFill() == Color.WHITE)
                    {
                        circle2D[i][5].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler6 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            if (num%2 == 0)
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][6].getFill() == Color.WHITE)
                    {
                        circle2D[i][6].setFill(Color.RED);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
            else
            {
                for (int i = 5; i >= 0; i--)
                {
                    if (circle2D[i][6].getFill() == Color.WHITE)
                    {
                        circle2D[i][6].setFill(Color.BLACK);
                        num++;
                        checkWinner();
                        break;
                    }
                }
            }
        }
    }
    class buttonHandler7 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent event )
        {
            result.setText("");
            for (int i = 5; i >= 0; i--)
            {
                for (int j = 6; j >= 0; j--)
                    circle2D[i][j].setFill(Color.WHITE);
            }
            setButton();
            num = 0;
        }
    }
}