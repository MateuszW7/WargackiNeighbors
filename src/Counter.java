public class Counter {

    public static int roll1d10(){
        return (int)(Math.random()*10)+1;
    }

    public static int totalCount(int[][]graph){
        return totalRowCount(graph) + totalColCount(graph);
    }

    public static void printGraph(int[][] graph){
        System.out.println("-----------");
        for(int[] innerArr : graph){
            System.out.print("|");
            for(int value: innerArr){
                System.out.print(value);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }

    private static int totalRowCount(int[][]graph) {
        int rowSum = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length - 1; j++) {
                if (graph[i][j] == graph[i][j + 1]) {
                    rowSum += graph[i][j];
                    boolean repeat = true;
                    while (j != 3&&repeat)
                        j++;
                    rowSum += graph[i][j];
                    if (graph[i][j] != graph[i][j + 1]) {
                        repeat = false;
                    } else if (j==3) {
                        rowSum += graph[i][j];
                    }
                }
            }
        }
        return rowSum;
    }
    private static int totalColCount(int[][]graph){
        int colSum = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length - 1; j++) {
                if (graph[j][i] == graph[j][i + 1]) {
                    colSum += graph[j][i];
                    boolean repeat = true;
                    while (j != 3 && repeat)
                        j++;
                    colSum += graph[j][i];
                    if (graph[j][i] != graph[j][i + 1]) {
                        repeat = false;
                    } else if (j==3) {
                        colSum += graph[j][i];
                    }
                }
            }
        }
        return colSum;
    }

}
