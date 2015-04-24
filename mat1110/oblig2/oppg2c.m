x = linspace (0,pi,100);
y1 = 2.*sin(x);
y2 = x;
plot (x,y1,x,y2);
title('oppgave 2c')
legend('y1 = 2sin(x)', 'y2 = x')
xlabel('0 \leq x \leq \pi')
ylabel('y')