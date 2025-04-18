public class Quadrilatero {
    

    final Ponto p1 = new Ponto(1, 2);
    final Ponto p2 = new Ponto(3, 4);
    final Ponto p3 = new Ponto(5, 6);
    final Ponto p4 = new Ponto(7, 8);

    
    final int baseMaior = 30;
    final int baseMenor = 20;
    final int altura = 15;

   
    public void calcularArea() {
        int area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapezoide: " + area);
    }

    
    public void imprimirCoordenadas() {
        System.out.println("P1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("P2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("P3: (" + p3.x + ", " + p3.y + ")");
        System.out.println("P4: (" + p4.x + ", " + p4.y + ")");
    }

    public static void main(String[] args) {
        Quadrilatero q = new Quadrilatero();
        q.calcularArea();
        q.imprimirCoordenadas();
    }
}

class Ponto {
    final int x;
    final int y;

    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
