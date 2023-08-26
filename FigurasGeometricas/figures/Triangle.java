package FigurasGeometricas.figures;

class Triangle {
    double base;
    double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        // Implementar el cálculo del perímetro si es necesario
        return  base+altura+calcularHipotenusa(); 
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || altura == base) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}