package Tetris.Logic;

import java.util.Arrays;

public class Board {
    public static final int WIDTH = 10;
    public static final int HEIGTH = 20;
    private int[][] matrix;

    public Board() {
        this.matrix = new int[Board.HEIGTH][Board.WIDTH];
    }

    /*
     * The coordinate System is from left to right and from top to bottom.
     */
    public int get(int x, int y) {
        return this.matrix[y][x];
    }

    public void set(int x, int y, int value) {
        this.matrix[y][x] = value;
    }

    public int computeFilledRows() {
        return this.deleteFilledRows(0);
    }

    /*
     * Elimina todos los renglones que estan llenos en el
     * tablero y regresa cuantos de ellos se eliminaron
     */
    private int deleteFilledRows(int numRowsDeleted) {
        // Esta funcion debe ser recursiva
        return numRowsDeleted;
    }

    /*
     * Verifica si el ultimo renglon esta completamente lleno.
     * Un renglon esta lleno si todos sus valores son distintos de 0.
     * @return True si el ultimo renglon del tablero esta lleno.
     *     False en otro caso.
     */
    private boolean isLastRowFilled() {
        return false;
    }
}
