:set fileformat=unix
#!/bin/sh
echo "the application will attempt to start"
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -cp /app/resources/:/app/classes/:/app/libs/* "com.jci.nv.cemm.NvCcaasBackendGatewayApplication"  "$@"