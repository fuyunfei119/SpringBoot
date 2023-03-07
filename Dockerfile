FROM mysql:8.0

# Copy the MySQL configuration file to the container
COPY ./my.cnf /etc/mysql/conf.d/my.cnf

# Set up the replication user and password
ENV MYSQL_REPLICATION_USER repl
ENV MYSQL_REPLICATION_PASSWORD replpass

# Set up the entrypoint script
COPY ./docker-entrypoint.sh /usr/local/bin/docker-entrypoint.sh
RUN chmod +x /usr/local/bin/docker-entrypoint.sh
ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["mysqld"]