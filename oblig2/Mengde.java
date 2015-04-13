class Mengde <E>{
    private Node<E> forran, bak = null;

    public boolean tom(){ // returnerer true hvis mengden er tom
	if(this.forran == null && this.bak == null) return true;
	return false;
    }
    public boolean leggTil(E e){ // returnerer true hvis objektet ble satt inn, false hvis objektet finnes fra før.
	if (inneholder(e)) return false;
	Node<E> ny = new Node<>(e);
	if (tom()){
	    this.forran = ny;
	    this.bak = ny;
	    return true;
	}
	this.bak.neste = ny;
	this.bak = ny;
	return true;
    }
    public E fjernEldste(){ // FIFO - first in, first out. Returnerer null hvis mengden er tom. E ellers
	if (tom()) return null;
	Node<E> temp = forran;
	if(this.forran.neste == null) this.bak = null;
	this.forran = forran.neste;
	return temp.objekt;
    }

    public E fjernNyeste(){ // LIFO - last in, first out. Returnerer null hvis mengden er tom.
	if (tom()) return null;
	Node<E> temp,temp2;
	temp = forran;
	while (temp != this.bak){
	    temp = temp.neste;
	}
	if (this.forran == this.bak) {
	    this.forran = null;
	    this.bak = null;
	    return temp.objekt;
	}
	temp2 = this.bak;
	this.bak = temp;
	return temp2.objekt;
    }

    public boolean inneholder(E e){ // true om 'e' er i mengden, false ellers.
	if (tom()) return false;
	Node<E> temp = forran;
	while (temp != this.bak){
	    if (e == temp.objekt || e == this.bak.objekt) return true;
	    temp = temp.neste;
	}
	return false;
    }

    private class Node <E>{
	E objekt;
	Node<E> neste;

	Node (E e){
	    this.objekt = e;
	}
    }
}
