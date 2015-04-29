function [] = oppg2e()
N = 1000;
x = linspace(-2.*pi ,2.*pi , N);
y = x;
fx = f(x, N);
gx = f(fx, N);
plot(x, y, x, gx)
legend('x = y','g(x) = f(f(x))')
title('oppgave 2e')
xlabel('-2\pi \leq x \leq 2\pi')
end

function [ ut ] = f(x,N)
for i=1:N
ut(i)=2.5.*sin(x(i));
end
end