package observer;

// Implementações concretas dos observadores
class Menu implements Observador {
    public void update() {
        System.out.println("Menu atualizado!");
    }
}
