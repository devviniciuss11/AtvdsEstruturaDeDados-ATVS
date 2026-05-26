public static void metodo(int n) {
    if (n == 0) {
        return;
    }

    metodo(n - 1);
    System.out.print(n + " ");
}

public static void main(String[] args) {
    metodo(4);
}
