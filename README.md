# rabbitmq-cluster

## To move nodes to One cluster:
### docker exec -it rabbitmq-cluster-rabbitmq3-1 bash
### rabbitmqctl stop_app
### rabbitmqctl reset
### rabbitmqctl join_cluster rabbit@rabbitmq1.local
### rabbitmqctl start_app
