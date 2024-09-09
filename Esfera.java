public class Esfera {
    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }

    public float calcularVolume() {
        return (4.0f / 3.0f) * (float)Math.PI * (float)Math.pow(raio, 3);
    }

    public float calcularArea() {
        return 4.0f * (float)Math.PI * (float)Math.pow(raio, 2);
    }

    public static  void main(String[] args) {

        Esfera esfera = new Esfera(8.0f);

        System.out.println("Raio da Esfera: " + esfera.raio);
        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
        System.out.println("Área da esfera: " + esfera.calcularArea());
    }
}
