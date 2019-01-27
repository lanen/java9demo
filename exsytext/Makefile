name=easytext.cli

build_dir=out
source_dir=src
output=dist

main=com.buyou.cli.Main

clean:
	rm -rf $(output)
	rm -rf out
	rm -rf image

build: clean
	mkdir $(output)
	javac -d $(build_dir) --module-source-path $(source_dir) --module easytext.algorithm.api
	javac -d $(build_dir) --module-source-path $(source_dir) --module easytext.algorithm.coleman
	javac -d $(build_dir) --module-source-path $(source_dir) --module easytext.algorithm.kincaid
	javac -d $(build_dir) --module-source-path $(source_dir) --module easytext.algorithm.naivesyllablecounter
	#javac -d $(build_dir) --module-source-path $(source_dir) --module-path $(build_dir):$$JAVA_HOME/jmods --module easytext.gui
	javac -d $(build_dir) --module-source-path $(source_dir) --module $(name)

package: build
	jar --create --file $(output)/easytext.algorithm.api.jar -C $(build_dir)/easytext.algorithm.api .
	jar --create --file $(output)/easytext.algorithm.coleman.jar -C $(build_dir)/easytext.algorithm.coleman .
	jar --create --file $(output)/easytext.algorithm.kincaid.jar -C $(build_dir)/easytext.algorithm.kincaid .
	jar --create --file $(output)/easytext.algorithm.naivesyllablecounter.jar -C $(build_dir)/easytext.algorithm.naivesyllablecounter .
	#jar --create --file $(output)/easytext.gui.jar -C $(build_dir)/easytext.gui .
	jar --create --file $(output)/$(name).jar --main-class $(main) -C $(build_dir)/$(name) .

run: build
	java --module-path $(output)  --module $(name)

run2: 
	java --module-path $(build_dir)  --module $(name)/$(main)

test-cli: package
	java --module-path $(output)  --module $(name) words.txt
test-gui: package
	java --module-path $(output):$JAVA_HOME/jmods --module easytext.gui  words.txt

jlink:
	jlink --module-path $(output):$$JAVA_HOME/jmods \
    	--add-modules $(name) \
    	--launcher start=$(name) \
    	--output image	
