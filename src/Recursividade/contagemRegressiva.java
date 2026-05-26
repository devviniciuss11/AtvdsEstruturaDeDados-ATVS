public void contagemRegressiva(int n) {
    if (n < 0) {
        return;
    }

    System.out.println(n);
    contagemRegressiva(n - 1);
}

void main() {
    contagemRegressiva(9);
}
