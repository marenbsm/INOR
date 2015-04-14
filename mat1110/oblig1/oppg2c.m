theta=linspace(0,2*pi,100);
ftheta=1+cos(theta);
x=ftheta.*cos(theta);
y=ftheta.*sin(theta);
plot(x,y);
axis('equal');
grid on;