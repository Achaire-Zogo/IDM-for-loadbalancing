FROM node:18-alpine

RUN apk add --no-cache curl

WORKDIR /app

COPY server.js .

EXPOSE 8080

CMD ["node", "server.js"]
