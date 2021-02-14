public class Area {

    int[][] data;
    int width;
    int height;

    Area(int width, int height) {
        this.width = width;
        this.height = height;
        data = new int[this.height][this.width];
    }

    public int[][] getData() {
        return this.data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void clearData() {
        fillRect(0, 0, this.width, this.height, 0);
    }

    public void setPoint(int x, int y, int value) {
        this.data[y][x] = value;
    }

    public void fillRect(int startX, int startY, int width, int height, int value) {
        for (int y = startY; y < startY + height; y++) {
            for (int x = startX; x < startX + width; x++) {
                this.data[y][x] = value;
            }
        }
    }

    public void drawRect(int startX, int startY, int width, int height, int value) {
        for (int x = startX; x < startX + width; x++) {
            this.data[startY][x] = value;
        }

        for (int y = startY + 1; y < startY + height - 1; y++) {
            this.data[y][startX] = value;
            this.data[y][startX + width - 1] = value;
        }
        for (int x = startX; x < startX + width; x++) {
            this.data[startY + height - 1][x] = value;
        }
    }

}
