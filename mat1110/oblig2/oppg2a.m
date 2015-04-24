function [ output ] = f( a, x, N )
% a går fra 0 til pi, x er en startverdi fra 0 til pi, N er antall iterasjoner.
output(1)=a.*sin(x);
for i = 2:N
        output(i) = a.*sin(output(i-1));
end
end