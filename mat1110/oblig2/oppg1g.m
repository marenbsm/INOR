diary oppg1g.out
A=[3 1 0 0; -1 1 0 0; 0 0 1 4; 0 0 1 4];
[U,V]=eig(A)
Uredusert=rref(U)
diary off