package Graphs;

public class Graphs {
    public static void main(String[] args) {

        generateGnk(4,3);
//        generateGNP(4,0.5);
        transformEtoA(4,3);
    }

    public static void generateGNP(int n, double p) {
        boolean[][] result = GraphGnp.generateGnp(n,p);
        PrintStructures.printA(result);

    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n, k);
        PrintStructures.printE(result);
    }
    public static void transformEtoA(int n, int k) {
        Edge[] graphGnk = GraphGnk.generateGnk(n, k);

        boolean[][] result = Transforms.transformEtoA(n,k,graphGnk);
        PrintStructures.printA(result);
    }
}
