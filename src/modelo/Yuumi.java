package modelo;

public class Yuumi extends Starter {

    private int cura; //PARA FICHEROS

    private final int VIDA_MAXIMA = 150;
    private final int DANO_MAXIMO = 36;
    private final int DANO_MINIMO = 4;
    private final int CURA_MAXIMA = 34;
    private final int CURA_MINIMA = 3;

    public Yuumi() {
        dano = DANO_MINIMO;
        vida = VIDA_MAXIMA;
        cura = CURA_MINIMA;
    }

    public Yuumi(int dano, double vida, int cantidadOro, int cura) {
        super(dano, vida, cantidadOro);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    @Override
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    @Override
    public int getDanoMaximo() {
        return DANO_MAXIMO;
    }

    @Override
    public int getDanoMinimo() {
        return DANO_MINIMO;
    }

    public int getCuraMaxima() {
        return CURA_MAXIMA;
    }

    @Override
    public String getNombre() {
        return "Yuumi";
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) { //sanación
        double danoBase = dano * 2;
        double danoAplicado = danoBase - danoBase * enemigo.getResistenciaMagica() / 100;
        enemigo.setVida(enemigo.getVida() - danoAplicado);

        curarse(cura);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) { //últimas páginas
        double danoBase = dano * 2.5;
        double danoAplicado = danoBase - danoBase * enemigo.getResistenciaMagica() / 100;
        enemigo.setVida(enemigo.getVida() - danoAplicado);

        int num = (int) (Math.random() * 100 + 1 + cura / 2);
        if (num > 50) { //Ciega
            enemigo.setCegadoSiPosible(true);
        }

        curarse(cura / 4);
    }

    private void curarse(double cantidadCura) {
        vida = vida + cantidadCura;
        if (vida > VIDA_MAXIMA) {
            vida = VIDA_MAXIMA;
        }
    }

    @Override
    public boolean isAtacaDosVeces() {
        return false;
    }

    @Override
    public boolean isFallaElAtaque() {
        return false;
    }

    @Override
    public boolean isPuedeEsquivar() {
        return false;
    }

    @Override
    public boolean isPonerseEscudo() {
        return false;
    }

    @Override
    public double ajustarDanoAResistencias(double dano) {
        return dano - dano * this.cura / 150;
    }
}
