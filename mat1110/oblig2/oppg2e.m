function [] = oppg2e()
N = 1000;
x = linspace(-2.*pi ,2.*pi , N);
fx = f(x, N);
gx = f(fx, N);
plot(x, fx, x, gx)
legend('f(x) = 2.5sin(x)','g(x) = f(f(x))')
title('oppgave 2e')
xlabel('-2\pi \leq x \leq 2\pi')
end

function [ ut ] = f(x,N)
for i=1:N
ut(i)=2.5.*sin(x(i));
end
end