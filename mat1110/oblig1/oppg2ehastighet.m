th=linspace(0,2*pi,100);
Vx=-sin(th)-sin(2.*th);
Vy=cos(th)+cos(2.*th);
plot(Vx,Vy);
axis('equal');
grid on;