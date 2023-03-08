package org.example.cw2.model;

public class Vextor {
    private Double x;
    private Double y;
    private Double z;

    public Vextor(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vextor() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vextor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длинну вектора
     */
    public double lenghtVector() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     * @param vextor2 второй вектор для произведения
     * @return сколяроне произведение
     */
    public double scalarMulti(Vextor vextor2) {
        return this.x * vextor2.x + this.y * vextor2.y + this.z * vextor2.z;
    }

    /**
     * @param vextor2 второй вектор для произведения
     * @return Векторное произведение
     */
    public Vextor multyVector(Vextor vextor2) {
        return new Vextor(this.y * vextor2.z - this.z * vextor2.y,
                this.z * vextor2.x - this.x * vextor2.z,
                this.x * vextor2.y - this.y * vextor2.x);
    }

    /**
     * @param vextor2 второй вектор для произведения
     * @return Коссинус угла
     */
    public double cosVector(Vextor vextor2) {
        return scalarMulti(vextor2) / (lenghtVector() * vextor2.lenghtVector());
    }

    /**
     * @param vextor2 второй вектор для произведения
     * @return Сумма векторов
     */
    public Vextor sumVector(Vextor vextor2) {
        return new Vextor (this.x + vextor2.x,this.y + vextor2.y, this.z + vextor2.z);
    }

    /**
     *
     * @param vextor2 второй вектор для произведения
     * @return Разность векторов
     */
    public Vextor diffVector(Vextor vextor2) {
        return new Vextor(this.x - vextor2.x,this.y - vextor2.y, this.z - vextor2.z);
    }
}
