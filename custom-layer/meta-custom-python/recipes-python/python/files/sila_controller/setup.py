import setuptools, os

HERE = os.path.abspath(os.path.dirname(__file__))

with open("README.md", "r") as fh:
    long_description = fh.read()

setuptools.setup(
    name="FairDemonstrator",
    version="0.0.1",
    author="Moritz Boesenberg",
    author_email="moritz.boesenberg@hahn-schickard.de",
    description="Main Communication of the Fair Demonstrator",
    long_description=long_description,
    long_description_content_type="text/markdown",
    packages=setuptools.find_packages(exclude=['test', 'examples']),
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.8',
)
