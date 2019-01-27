name=hello

SRCS=src/hello/com/buyou/hello/Hello.java \
	src/hello/module-info.java

output=dist
main=com.buyou.hello.Hello

clean:
	rm -rf $(output)
	rm -rf out
	rm -rf image

build: clean
	#javac -d out/$(name) $(SRCS)
	javac -d out --module-source-path src --module $(name)

package: build
	mkdir $(output)
	jar --create --file $(output)/$(name).jar --main-class $(main) -C out/$(name) .

run: package
	java --module-path $(output)  --module $(name)

run2: package
	java --module-path out  --module $(name)/$(main)

jlink:
	jlink --module-path $(output):$$JAVA_HOME/jmods \
    	--add-modules $(name) \
    	--launcher start=$(name) \
    	--output image	
