# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Python implementation of the SiLA 2 standard for lab automation"
HOMEPAGE = "https://gitlab.com/sila2/sila_python"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9ba4a5286ebedfadc8014cd5bd85ba0 \
                    file://sila_base/LICENSE;md5=a84b005812a42482472e67db8be8405a"

SRC_URI = "git://github.com/lemmi25/silaTest.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.1.0+git${SRCPV}"
SRCREV = "eeea7cd952203fe6b135412d5ae13f1705fb2e87"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-asyncio python3-core python3-datetime python3-grpcio python3-io python3-jinja2 python3-json python3-logging python3-lxml python3-math python3-misc python3-netclient python3-protobuf python3-pytest python3-threading python3-typing python3-unittest python3-zeroconf"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    discovery
#    error_handling
#    jsonschema
#    lxml.etree
#    metadata
#    observable_command
#    observable_property
#    sila2
#    sila2.client
#    sila2.client.client_feature
#    sila2.client.client_metadata
#    sila2.client.client_observable_command
#    sila2.client.client_observable_command_instance
#    sila2.client.client_observable_property
#    sila2.client.client_unobservable_command
#    sila2.client.client_unobservable_property
#    sila2.client.execution_info_subscription_thread
#    sila2.client.no_intermediate_responses
#    sila2.client.sila_client
#    sila2.client.subscription_stream
#    sila2.client.utils
#    sila2.code_generator
#    sila2.code_generator.feature_generator
#    sila2.code_generator.main
#    sila2.code_generator.package_generator
#    sila2.code_generator.template_environment
#    sila2.code_generator.template_loader
#    sila2.code_generator.template_objects.base
#    sila2.code_generator.template_objects.basics
#    sila2.code_generator.template_objects.client
#    sila2.code_generator.template_objects.types
#    sila2.discovery
#    sila2.discovery.broadcaster
#    sila2.discovery.browser
#    sila2.discovery.listener
#    sila2.discovery.service_info
#    sila2.features.silaservice
#    sila2.framework
#    sila2.framework.abc.binary_transfer_handler
#    sila2.framework.abc.composite_message_mappable
#    sila2.framework.abc.constraint
#    sila2.framework.abc.data_type
#    sila2.framework.abc.message_mappable
#    sila2.framework.abc.named_data_node
#    sila2.framework.abc.named_node
#    sila2.framework.abc.sila_error
#    sila2.framework.binary_transfer.binary_download_failed
#    sila2.framework.binary_transfer.binary_transfer_error
#    sila2.framework.binary_transfer.binary_upload_failed
#    sila2.framework.binary_transfer.client_binary_transfer_handler
#    sila2.framework.binary_transfer.download_servicer
#    sila2.framework.binary_transfer.invalid_binary_transfer_uuid
#    sila2.framework.binary_transfer.server_binary_transfer_handler
#    sila2.framework.binary_transfer.upload_servicer
#    sila2.framework.command.command
#    sila2.framework.command.command_confirmation
#    sila2.framework.command.command_execution_uuid
#    sila2.framework.command.duration
#    sila2.framework.command.execution_info
#    sila2.framework.command.intermediate_response
#    sila2.framework.command.observable_command
#    sila2.framework.command.parameter
#    sila2.framework.command.response
#    sila2.framework.command.unobservable_command
#    sila2.framework.constraints.allowed_types
#    sila2.framework.constraints.comparison_constraint
#    sila2.framework.constraints.content_type
#    sila2.framework.constraints.element_count
#    sila2.framework.constraints.fully_qualified_identifier
#    sila2.framework.constraints.length
#    sila2.framework.constraints.maximal_element_count
#    sila2.framework.constraints.maximal_exclusive
#    sila2.framework.constraints.maximal_inclusive
#    sila2.framework.constraints.maximal_length
#    sila2.framework.constraints.minimal_element_count
#    sila2.framework.constraints.minimal_exclusive
#    sila2.framework.constraints.minimal_inclusive
#    sila2.framework.constraints.minimal_length
#    sila2.framework.constraints.pattern
#    sila2.framework.constraints.schema
#    sila2.framework.constraints.set
#    sila2.framework.constraints.unit
#    sila2.framework.data_types.any
#    sila2.framework.data_types.binary
#    sila2.framework.data_types.boolean
#    sila2.framework.data_types.constrained
#    sila2.framework.data_types.data_type_definition
#    sila2.framework.data_types.date
#    sila2.framework.data_types.integer
#    sila2.framework.data_types.list
#    sila2.framework.data_types.real
#    sila2.framework.data_types.string
#    sila2.framework.data_types.structure
#    sila2.framework.data_types.time
#    sila2.framework.data_types.timestamp
#    sila2.framework.data_types.timezone
#    sila2.framework.defined_execution_error_node
#    sila2.framework.errors.command_execution_not_accepted
#    sila2.framework.errors.command_execution_not_finished
#    sila2.framework.errors.defined_execution_error
#    sila2.framework.errors.framework_error
#    sila2.framework.errors.invalid_command_execution_uuid
#    sila2.framework.errors.invalid_metadata
#    sila2.framework.errors.no_metadata_allowed
#    sila2.framework.errors.sila_connection_error
#    sila2.framework.errors.undefined_execution_error
#    sila2.framework.errors.validation_error
#    sila2.framework.feature
#    sila2.framework.fully_qualified_identifier
#    sila2.framework.metadata
#    sila2.framework.property.observable_property
#    sila2.framework.property.property
#    sila2.framework.property.unobservable_property
#    sila2.framework.utils
#    sila2.pb2_stubs
#    sila2.pb2_stubs.SiLABinaryTransfer_pb2
#    sila2.pb2_stubs.SiLAFramework_pb2
#    sila2.server
#    sila2.server.feature_implementation_base
#    sila2.server.feature_implementation_servicer
#    sila2.server.metadata_interceptor
#    sila2.server.observables.observable_command_manager
#    sila2.server.observables.stream
#    sila2.server.observables.subscription_manager_thread
#    sila2.server.sila_server
#    sila2.server.silaservice_impl
#    sila2.server.utils
#    sila2_example_server
#    sila2_example_server.generated.delayprovider
#    src.sila2.features.silaservice.silaservice_client
#    unobservables
#    xmlschema
