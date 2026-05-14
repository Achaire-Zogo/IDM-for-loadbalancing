FROM node:18-alpine

RUN apk add --no-cache curl

WORKDIR /app

COPY server.js .

EXPOSE 3000

CMD ["node", "server.js"]
