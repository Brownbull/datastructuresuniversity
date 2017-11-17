/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Profesores
 */
public class AVLTree {
    
    private static class Nodo {
        Nodo izq, der;
        Nodo parent;
        int value ;
        int h = 0;

        public Nodo(int data, Nodo parent) {
            this.value = data;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return value + " h: " + h + " parent " + (parent == null ? "NULL" : parent.value) + " | ";
        }

        void setLeftChild(Nodo child) {
            if (child != null) {
                child.parent = this;
            }

            this.izq = child;
        }

        void setRightChild(Nodo child) {
            if (child != null) {
                child.parent = this;
            }

            this.der = child;
        }
    } // end of private static class Nodo

    private Nodo root = null;

    public void insert(int data) {
        insertar(root, data);
    }

    private int altura(Nodo nod) {
        return nod == null ? -1 : nod.h;
    }

    private void insertar(Nodo t, int value) {
        if (root == null) {
            System.out.println("creando raiz... "+value);
            root = new Nodo(value, null);
            return;
        }

        if (value < t.value) {
            if (t.izq != null) {
                insertar(t.izq, value);
            } else {
                System.out.println("creando izq ..."+value);
                t.izq = new Nodo(value, t);
            }

            if (altura(t.izq) - altura(t.der) == 2) { //left heavier
                if (value < t.der.value) {
                    System.out.println("rotacion der");
                    rotateRight(t);
                } else {
                    System.out.println("rotacion izq-der");
                    rotateLeftThenRight(t);
                }
            }
        } else if (value > t.value) {
            if (t.der != null) {
                insertar(t.der, value);
            } else {
                System.out.println("creando der ..."+value);
                t.der = new Nodo(value, t);
            }

            if (altura(t.der) - altura(t.izq) == 2) { //right heavier
                if (value > t.der.value){
                    System.out.println("rotacion izq");
                    rotateLeft(t);
                }
                else{
                    System.out.println("rotacion der-izq");
                    rotateRightThenLeft(t);
                }
            }
        }

        reHeight(t);
    }

    private void rotateRight(Nodo pivot) {
        Nodo parent = pivot.parent;
        Nodo leftChild = pivot.izq;
        Nodo rightChildOfLeftChild = leftChild.der;
        pivot.setLeftChild(rightChildOfLeftChild);
        leftChild.setRightChild(pivot);
        if (parent == null) {
            this.root = leftChild;
            leftChild.parent = null;
            return;
        }

        if (parent.izq == pivot) {
            parent.setLeftChild(leftChild);
        } else {
            parent.setRightChild(leftChild);
        }

        reHeight(pivot);
        reHeight(leftChild);
    }

    private void rotateLeft(Nodo pivot) {
        Nodo parent = pivot.parent;
        Nodo rightChild = pivot.der;
        Nodo leftChildOfRightChild = rightChild.izq;
        pivot.setRightChild(leftChildOfRightChild);
        rightChild.setLeftChild(pivot);
        if (parent == null) {
            this.root = rightChild;
            rightChild.parent = null;
            return;
        }

        if (parent.izq == pivot) {
            parent.setLeftChild(rightChild);
        } else {
            parent.setRightChild(rightChild);
        }

        reHeight(pivot);
        reHeight(rightChild);
    }

    private void reHeight(Nodo nod) {
        nod.h = Math.max(altura(nod.izq), altura(nod.der)) + 1;
    }

    private void rotateLeftThenRight(Nodo nod) {
        rotateLeft(nod.izq);
        rotateRight(nod);
    }

    private void rotateRightThenLeft(Nodo nod) {
        rotateRight(nod.der);
        rotateLeft(nod);
    }

    public boolean delete(int key) {
        Nodo t = search(key);
        if (t == null) return false;
        t = deleteNode(t);
        balanceTree(t.parent);
        return true;
    }

    private Nodo deleteNode(Nodo t) {
        if (isHoja(t)) { //leaf
            if (isLeftChild(t)) {
                t.parent.izq = null;
            } else {
                t.parent.der = null;
            }
        } else if (t.izq == null ^ t.der == null) { //exact 1 child
            Nodo aux = t.izq == null ? t.izq : t.izq; 
            if (isLeftChild(t)) {
                t.parent.setLeftChild(aux); 
            } else {
                t.parent.setRightChild(aux);
            }
        } else {//2 children
            System.out.println("2 hijos");
            Nodo aux2 = immediatePredInOrder(t);
            t.value = aux2.value;
            t = deleteNode(aux2);
        }

        reHeight(t.parent);
        return t;
    }

    private Nodo immediatePredInOrder(Nodo t) {
        Nodo actual = t.izq;
        while (actual.der != null) {
            actual = actual.der;
        }

        return actual;
    }

    private boolean isLeftChild(Nodo p) {
        return (p.parent.izq == p);
    }

    private boolean isHoja(Nodo nod) {
        return nod.izq == null && nod.izq == null;
    }

    private int calDifference(Nodo p) {
        int rightHeight = altura(p.der);
        int leftHeight = altura(p.izq);
        return rightHeight - leftHeight;
    }

    private void balanceTree(Nodo t) {
        int difference = calDifference(t);
        Nodo parent = t.parent;
        if (difference == -2) {
            if (altura(t.izq.izq) >= altura(t.izq.der)) {
                rotateRight(t);
            } else {
                rotateLeftThenRight(t);
            }
        } else if (difference == 2) {
            if (altura(t.der.der) >= altura(t.der.izq)) {
                rotateLeft(t);
            } else {
                rotateRightThenLeft(t);
            }
        }

        if (parent != null) {
            balanceTree(parent);
        }

        reHeight(t);
    }

    public Nodo search(int key) {
        return binarySearch(root, key);
    }

    private Nodo binarySearch(Nodo t, int key) {
        if (t == null) return null;

        if (key == t.value) {
            return t;
        }

        if (key < t.value && t.izq != null) {
            return binarySearch(t.izq, key);
        }

        if (key > t.value && t.der != null) {
            return binarySearch(t.der, key);
        }

        return null;
    }

    public void InOrder() {
        System.out.println("\nR " + root.toString() + " ... ");
        inorder(root);
        System.out.println();
    }

    private void inorder(Nodo p) {
        if (p != null) {
                System.out.print("(");
            inorder(p.izq);
            System.out.print(p.toString());
            inorder(p.der);
                System.out.println(")");
        }
    }
 /*
    public boolean balanceWeight(ABB T){
        if(T == null)
            return null;
        else{
            wi = h(T->izq);
            wd = h(T->der);
            if(abs(wi - wd) < 2)
                return balancew(t->izq) and balancew(t->der);
            else
                reutrn false;
        }        
    }
    
    public boolean balanceh(ABB T){
        if(T == null)
            return null;
        else{
            hi = h(T->izq);
            hd = h(T->der);
            if(abs(hi - hd) < 2)
                return balanceh(t->izq) and balanceh(t->der);
            else
                reutrn false;
        }        
    }
    
    Buscar (T, e){
        buscar en abb
    }
    
    Insertar (T, e){
        insertar como un abb()
        rebalanceo o  rotaciones()
    }
    
    Eliminar (T, e){
        eliminar como un abb()
        rebalanceo o  rotaciones()
    }
*/
}
