function [ output ] = f( a, x, N )
output(1)=a.*sin(x);
for i = 2:N
        output(i) = a.*sin(output(i-1));
end
end