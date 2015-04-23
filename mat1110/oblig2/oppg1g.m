diary oppg1g.out
A=[3 1 0 0; -1 1 0 0; 0 0 1 4; 0 0 1 4];
[U,V]=eig(A)
Aradredusert=rref(A)
diary off